package Reflection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class CompanyReflection {
    public static void main(String[] args) throws Exception {
        Company comp = new Company ("Veridian solutions",24000);
        Class compClass =comp.getClass();
        System.out.println("Name of the class with package name: "+ compClass.getName());
        System.out.println("Name of the class: " + compClass.getSimpleName());
        Field[] compayFields = compClass.getDeclaredFields();
        for(Field field:compayFields){}
        System.out.println("Name of company:"+ comp.getName());
        Method[] compMethods = compClass.getDeclaredMethods();


//            @Override
//            public String toString(){
//                return "Company{" + "name='" +name +'\''+ "numOfEmployees=" +numOfEmployees + '}';
//            }
//
//            @Override
//        public boolean equals(Object obj){
//                if (this == obj) return true;
//                if (obj == null || getClass() != obj.getClass()) return false;
//                Company company = (Company) obj;
//                return numOfEmployees == company.numOfEmploees &&
//                        Objects.equals(name.company.name);
//            }
//            @Override
//                    public int hashCode(){
//                return Objects.hash(name,numOfEmployees);
//        }


        for(Method method:compMethods){
            if(method.getName().equals("setNumOfEmployees")){
                method.setAccessible(true);
                method.invoke(comp,25000);
            }else if(method.getName().equals("InternalRules")){
                method.setAccessible(true);
                method.invoke(null);

            }
        }
        System.out.println("Number of employees: "+ comp.getNumOfEmployees());
    }
}
