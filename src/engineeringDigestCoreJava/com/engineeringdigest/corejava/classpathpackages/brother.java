package engineeringDigestCoreJava.com.engineeringdigest.corejava.classpathpackages;

public class brother {
//    innerClass y = new innerClass(); this is not the way
    parentClass x = new parentClass();  // pehle public class{PARENT CLASS} eska instance create karo..

//   then --> parentClassName.childClassName variableForInnerClass = variableOfParentClass.new innerClassName()
    parentClass.innerClass y = x.new innerClass();
//    ab ye within the package kisi bhi program me access ho jaaega
}
