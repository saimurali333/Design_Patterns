package FactoryPattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeFactory {

    private static final Map<String,Class<? extends IShape>> registeredShapes = new ConcurrentHashMap<>();

    static{
        for(ShapeEum shapeEum : ShapeEum.values()){
            if(shapeEum.getShapeClass() != null) {
                registerShape(shapeEum.toString().toLowerCase(), shapeEum.getShapeClass());
            }
        }
    }

    public static void registerShape(String shapeEumId, Class<? extends IShape> shapeClass){
        registeredShapes.put(shapeEumId.toLowerCase(),shapeClass);
    }
    public IShape getShape(String shapeEumId)  {
       if(registeredShapes.containsKey(shapeEumId)) {
           try {
               return registeredShapes.get(shapeEumId.toLowerCase()).getDeclaredConstructor().newInstance();
           } catch (Exception e){
               System.out.println("Exception occurred "+e.getMessage());
               e.printStackTrace();
           }
       }
       return null;

    }
}
