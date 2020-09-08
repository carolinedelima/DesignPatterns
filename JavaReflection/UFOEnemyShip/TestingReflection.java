import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestingReflection {

    public static void main(String[] args) {

        // Getting the class Object for UFOEnemyShip
        // Everything in Java has a Class Object

        Class reflectClass = UFOEnemyShip.class;

        // Get the class name of an Object

        String className = reflectClass.getName();

        System.out.println(className + "\n");

        // Access private fields using reflection

        // Field stores info on a single field of a class

        Field privateStringName = null;

        try {

            // Create a UFOEnemyShip object

            UFOEnemyShip enemyshipPrivate = new UFOEnemyShip();

            // Define the private field you want to access
            // I can access any field with just its name dynamically

            privateStringName = UFOEnemyShip.class.getDeclaredField("idCode");

            // Shuts down security allowing you to access private fields

            privateStringName.setAccessible(true);

            // Get the value of a field and store it in a String

            String valueOfName = (String) privateStringName.get(enemyshipPrivate);

            System.out.println("EnemyShip Private Name: " + valueOfName);

            // Get access to a private method
            // getDeclaredMethod("methodName", methodParamters or null)

            // Since I provide the method name as a String I can run any method
            // without needing to follow the normal convention methodName()

            String methodName = "getPrivate";

            Method privateMethod = UFOEnemyShip.class.getDeclaredMethod(methodName, null);

            // Shuts down security allowing you to access private methods

            privateMethod.setAccessible(true);

            // get the return value from the method

            String privateReturnVal = (String) privateMethod.invoke(enemyshipPrivate, null);

            System.out.println("EnemyShip Private Method: " + privateReturnVal);

            // Execute a method that has parameters

            // Define the parameters expected by the private method

            Class[] methodParameters = new Class[]{Integer.TYPE, String.class};

            // Provide the parameters above with values

            Object[] params = new Object[]{new Integer(10), new String("Random")};

            // Get the method by providing its name and a Class array with parameters

            privateMethod = UFOEnemyShip.class.getDeclaredMethod("getOtherPrivate", methodParameters);

            // Shuts down security allowing you to access private methods

            privateMethod.setAccessible(true);

            // Execute the method and pass parameter values. The return value is stored

            privateReturnVal = (String) privateMethod.invoke(enemyshipPrivate, params);

            System.out.println("EnemyShip Other Private Method: " + privateReturnVal);

        }
        catch (NoSuchFieldException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
