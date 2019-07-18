package com.google.ads.mediation;

import com.google.android.gms.internal.ads.Tl;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Deprecated
public class MediationServerParameters
{
  public void load(Map<String, String> paramMap)
    throws MediationServerParameters.MappingException
  {
    Object localObject1 = new HashMap();
    Object localObject4;
    for (localObject3 : getClass().getFields())
    {
      localObject4 = (Parameter)((Field)localObject3).getAnnotation(Parameter.class);
      if (localObject4 != null) {
        ((Map)localObject1).put(((Parameter)localObject4).name(), localObject3);
      }
    }
    if (((Map)localObject1).isEmpty()) {
      Tl.d("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject3 = (Map.Entry)paramMap.next();
      localObject4 = (Field)((Map)localObject1).remove(((Map.Entry)localObject3).getKey());
      if (localObject4 != null)
      {
        try
        {
          ((Field)localObject4).set(this, ((Map.Entry)localObject3).getValue());
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          String str = (String)((Map.Entry)localObject3).getKey();
          localObject3 = new StringBuilder(String.valueOf(str).length() + 43);
          ((StringBuilder)localObject3).append("Server option \"");
          ((StringBuilder)localObject3).append(str);
          ((StringBuilder)localObject3).append("\" could not be set: Bad Type");
          Tl.d(((StringBuilder)localObject3).toString());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localObject3 = (String)((Map.Entry)localObject3).getKey();
          localObject5 = new StringBuilder(String.valueOf(localObject3).length() + 49);
          ((StringBuilder)localObject5).append("Server option \"");
          ((StringBuilder)localObject5).append((String)localObject3);
          ((StringBuilder)localObject5).append("\" could not be set: Illegal Access");
          Tl.d(((StringBuilder)localObject5).toString());
        }
      }
      else
      {
        localObject5 = (String)((Map.Entry)localObject3).getKey();
        ??? = (String)((Map.Entry)localObject3).getValue();
        localObject3 = new StringBuilder(String.valueOf(localObject5).length() + 31 + String.valueOf(???).length());
        ((StringBuilder)localObject3).append("Unexpected server option: ");
        ((StringBuilder)localObject3).append((String)localObject5);
        ((StringBuilder)localObject3).append(" = \"");
        ((StringBuilder)localObject3).append((String)???);
        ((StringBuilder)localObject3).append("\"");
        Tl.a(((StringBuilder)localObject3).toString());
      }
    }
    Object localObject3 = new StringBuilder();
    Object localObject5 = ((Map)localObject1).values().iterator();
    while (((Iterator)localObject5).hasNext())
    {
      localObject1 = (Field)((Iterator)localObject5).next();
      if (((Parameter)((Field)localObject1).getAnnotation(Parameter.class)).required())
      {
        paramMap = String.valueOf(((Parameter)((Field)localObject1).getAnnotation(Parameter.class)).name());
        if (paramMap.length() != 0) {
          paramMap = "Required server option missing: ".concat(paramMap);
        } else {
          paramMap = new String("Required server option missing: ");
        }
        Tl.d(paramMap);
        if (((StringBuilder)localObject3).length() > 0) {
          ((StringBuilder)localObject3).append(", ");
        }
        ((StringBuilder)localObject3).append(((Parameter)((Field)localObject1).getAnnotation(Parameter.class)).name());
      }
    }
    if (((StringBuilder)localObject3).length() > 0)
    {
      paramMap = String.valueOf(((StringBuilder)localObject3).toString());
      if (paramMap.length() != 0) {
        paramMap = "Required server option(s) missing: ".concat(paramMap);
      } else {
        paramMap = new String("Required server option(s) missing: ");
      }
      throw new MappingException(paramMap);
    }
  }
  
  public static final class MappingException
    extends Exception
  {
    public MappingException(String paramString)
    {
      super();
    }
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.FIELD})
  public static @interface Parameter
  {
    String name();
    
    boolean required() default true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/ads/mediation/MediationServerParameters.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */