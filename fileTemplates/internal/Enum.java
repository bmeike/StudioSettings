#parse("File Header.java")
#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
#if (${VISIBILITY} == "PUBLIC")public #end enum ${NAME} #if (${INTERFACES} != "")implements ${INTERFACES} #end {
}
