import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class lt
{
  static String a(it paramit, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    a(paramit, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
  
  private static final String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      if (Character.isUpperCase(c)) {
        localStringBuilder.append("_");
      }
      localStringBuilder.append(Character.toLowerCase(c));
    }
    return localStringBuilder.toString();
  }
  
  private static void a(it paramit, StringBuilder paramStringBuilder, int paramInt)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject1 = new TreeSet();
    Object localObject3;
    for (localObject3 : paramit.getClass().getDeclaredMethods())
    {
      localHashMap2.put(((Method)localObject3).getName(), localObject3);
      if (((Method)localObject3).getParameterTypes().length == 0)
      {
        localHashMap1.put(((Method)localObject3).getName(), localObject3);
        if (((Method)localObject3).getName().startsWith("get")) {
          ((Set)localObject1).add(((Method)localObject3).getName());
        }
      }
    }
    Iterator localIterator = ((Set)localObject1).iterator();
    while (localIterator.hasNext())
    {
      ??? = (String)localIterator.next();
      localObject3 = "";
      Object localObject4 = ((String)???).replaceFirst("get", "");
      boolean bool1 = ((String)localObject4).endsWith("List");
      boolean bool2 = true;
      Object localObject5;
      if ((bool1) && (!((String)localObject4).endsWith("OrBuilderList")) && (!((String)localObject4).equals("List")))
      {
        localObject5 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        localObject1 = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 4));
        if (((String)localObject1).length() != 0) {
          localObject1 = ((String)localObject5).concat((String)localObject1);
        } else {
          localObject1 = new String((String)localObject5);
        }
        localObject5 = (Method)localHashMap1.get(???);
        if ((localObject5 != null) && (((Method)localObject5).getReturnType().equals(List.class)))
        {
          a(paramStringBuilder, paramInt, a((String)localObject1), Es.a((Method)localObject5, paramit, new Object[0]));
          continue;
        }
      }
      if ((((String)localObject4).endsWith("Map")) && (!((String)localObject4).equals("Map")))
      {
        localObject1 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        localObject5 = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 3));
        if (((String)localObject5).length() != 0) {
          localObject1 = ((String)localObject1).concat((String)localObject5);
        } else {
          localObject1 = new String((String)localObject1);
        }
        ??? = (Method)localHashMap1.get(???);
        if ((??? != null) && (((Method)???).getReturnType().equals(Map.class)) && (!((Method)???).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)???).getModifiers())))
        {
          a(paramStringBuilder, paramInt, a((String)localObject1), Es.a((Method)???, paramit, new Object[0]));
          continue;
        }
      }
      localObject1 = String.valueOf(localObject4);
      if (((String)localObject1).length() != 0) {
        localObject1 = "set".concat((String)localObject1);
      } else {
        localObject1 = new String("set");
      }
      if ((Method)localHashMap2.get(localObject1) != null) {
        if (((String)localObject4).endsWith("Bytes"))
        {
          localObject1 = String.valueOf(((String)localObject4).substring(0, ((String)localObject4).length() - 5));
          if (((String)localObject1).length() != 0) {
            localObject1 = "get".concat((String)localObject1);
          } else {
            localObject1 = new String("get");
          }
          if (localHashMap1.containsKey(localObject1)) {}
        }
        else
        {
          localObject1 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
          ??? = String.valueOf(((String)localObject4).substring(1));
          if (((String)???).length() != 0) {
            localObject1 = ((String)localObject1).concat((String)???);
          } else {
            localObject1 = new String((String)localObject1);
          }
          ??? = String.valueOf(localObject4);
          if (((String)???).length() != 0) {
            ??? = "get".concat((String)???);
          } else {
            ??? = new String("get");
          }
          localObject5 = (Method)localHashMap1.get(???);
          ??? = String.valueOf(localObject4);
          if (((String)???).length() != 0) {
            ??? = "has".concat((String)???);
          } else {
            ??? = new String("has");
          }
          ??? = (Method)localHashMap1.get(???);
          if (localObject5 != null)
          {
            localObject4 = Es.a((Method)localObject5, paramit, new Object[0]);
            if (??? == null)
            {
              if ((localObject4 instanceof Boolean)) {
                if (((Boolean)localObject4).booleanValue()) {}
              }
              for (;;)
              {
                bool1 = true;
                break;
                label868:
                label892:
                label958:
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          bool1 = false;
                          break label980;
                          if (!(localObject4 instanceof Integer)) {
                            break;
                          }
                        } while (((Integer)localObject4).intValue() != 0);
                        break;
                        if (!(localObject4 instanceof Float)) {
                          break label868;
                        }
                      } while (((Float)localObject4).floatValue() != 0.0F);
                      break;
                      if (!(localObject4 instanceof Double)) {
                        break label892;
                      }
                    } while (((Double)localObject4).doubleValue() != 0.0D);
                    break;
                    if ((localObject4 instanceof String)) {}
                    for (??? = localObject3;; ??? = _r.a)
                    {
                      bool1 = localObject4.equals(???);
                      break label980;
                      if (!(localObject4 instanceof _r)) {
                        break;
                      }
                    }
                    if (!(localObject4 instanceof it)) {
                      break label958;
                    }
                  } while (localObject4 != ((it)localObject4).a());
                  break;
                } while ((!(localObject4 instanceof Enum)) || (((Enum)localObject4).ordinal() != 0));
              }
              label980:
              if (!bool1) {
                bool1 = bool2;
              } else {
                bool1 = false;
              }
            }
            else
            {
              bool1 = ((Boolean)Es.a((Method)???, paramit, new Object[0])).booleanValue();
            }
            if (bool1) {
              a(paramStringBuilder, paramInt, a((String)localObject1), localObject4);
            }
          }
        }
      }
    }
    if ((paramit instanceof Es.c))
    {
      localObject3 = ((Es.c)paramit).zzjv.e();
      while (((Iterator)localObject3).hasNext())
      {
        ??? = (Map.Entry)((Iterator)localObject3).next();
        ??? = ((Es.d)((Map.Entry)???).getKey()).a;
        localObject1 = new StringBuilder(13);
        ((StringBuilder)localObject1).append("[");
        ((StringBuilder)localObject1).append(???);
        ((StringBuilder)localObject1).append("]");
        a(paramStringBuilder, paramInt, ((StringBuilder)localObject1).toString(), ((Map.Entry)???).getValue());
      }
    }
    paramit = ((Es)paramit).zzjp;
    if (paramit != null) {
      paramit.a(paramStringBuilder, paramInt);
    }
  }
  
  static final void a(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        a(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        a(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
      }
      return;
    }
    paramStringBuilder.append('\n');
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramInt; k++) {
      paramStringBuilder.append(' ');
    }
    paramStringBuilder.append(paramString);
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(Nt.a(_r.a((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof _r))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(Nt.a((_r)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof Es))
    {
      paramStringBuilder.append(" {");
      a((Es)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      for (k = j; k < paramInt; k++) {
        paramStringBuilder.append(' ');
      }
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      k = paramInt + 2;
      a(paramStringBuilder, k, "key", paramString.getKey());
      a(paramStringBuilder, k, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      for (k = i; k < paramInt; k++) {
        paramStringBuilder.append(' ');
      }
      paramStringBuilder.append("}");
      return;
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject.toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */