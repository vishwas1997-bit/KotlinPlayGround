package basicConcept.annotation

import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.RoundEnvironment
import javax.annotation.processing.SupportedAnnotationTypes
import javax.annotation.processing.SupportedSourceVersion
import javax.lang.model.SourceVersion
import javax.lang.model.element.ElementKind
import javax.lang.model.element.TypeElement


@SupportedAnnotationTypes("GenerateToString")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
class ToStringGeneratorProcessor: AbstractProcessor() {
    override fun process(annotations: Set<TypeElement?>?, roundEnv: RoundEnvironment): Boolean {
        for (element in roundEnv.getElementsAnnotatedWith(GenerateToString::class.java)) {
            if (element.kind == ElementKind.CLASS) {
                generateToStringMethod(element as TypeElement)
            }
        }
        return true
    }

    private fun generateToStringMethod(classElement: TypeElement) {
        val className = classElement.simpleName.toString()
        val packageName = processingEnv.elementUtils.getPackageOf(classElement).toString()
        val generatedCode = StringBuilder()
        generatedCode.append("package").append(packageName).append(";\n\n")
        generatedCode.append("public class").append(className).append(" {\n\n")
        generatedCode.append("@Override\n")
        generatedCode.append("public String toString() {\n")
        generatedCode.append("return \"").append(className).append("{\" +\n")
        for (enclosedElement in classElement.enclosedElements) {
            if (enclosedElement.kind === ElementKind.FIELD) {
                val fieldName = enclosedElement.simpleName.toString()
                generatedCode.append("\"").append(fieldName).append("='\" + ")
                    .append(fieldName).append(" + \"',\" +\n")
            }
        }
        generatedCode.append("\"}\";\n")
        generatedCode.append("}\n")
        generatedCode.append("}\n")

        // Write the generated code to a file
        try {
            val sourceFile = processingEnv.filer.createSourceFile("$packageName.$className")
            sourceFile.openWriter().use { writer -> writer.write(generatedCode.toString()) }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}