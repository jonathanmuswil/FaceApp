import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class fy
{
  static String a(by paramby, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    a(paramby, localStringBuilder, 0);
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
  
  private static void a(by paramby, StringBuilder paramStringBuilder, int paramInt)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject1 = new TreeSet();
    Object localObject3;
    for (localObject3 : paramby.getClass().getDeclaredMethods())
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
    ??? = ((Set)localObject1).iterator();
    while (((Iterator)???).hasNext())
    {
      localObject3 = (String)((Iterator)???).next();
      Object localObject4 = ((String)localObject3).replaceFirst("get", "");
      boolean bool1 = ((String)localObject4).endsWith("List");
      boolean bool2 = true;
      Object localObject5;
      if ((bool1) && (!((String)localObject4).endsWith("OrBuilderList")) && (!((String)localObject4).equals("List")))
      {
        localObject1 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        localObject5 = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 4));
        if (((String)localObject5).length() != 0) {
          localObject1 = ((String)localObject1).concat((String)localObject5);
        } else {
          localObject1 = new String((String)localObject1);
        }
        localObject5 = (Method)localHashMap1.get(localObject3);
        if ((localObject5 != null) && (((Method)localObject5).getReturnType().equals(List.class)))
        {
          a(paramStringBuilder, paramInt, a((String)localObject1), sx.a((Method)localObject5, paramby, new Object[0]));
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
        localObject3 = (Method)localHashMap1.get(localObject3);
        if ((localObject3 != null) && (((Method)localObject3).getReturnType().equals(Map.class)) && (!((Method)localObject3).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject3).getModifiers())))
        {
          a(paramStringBuilder, paramInt, a((String)localObject1), sx.a((Method)localObject3, paramby, new Object[0]));
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
          localObject3 = String.valueOf(((String)localObject4).substring(1));
          if (((String)localObject3).length() != 0) {
            localObject1 = ((String)localObject1).concat((String)localObject3);
          } else {
            localObject1 = new String((String)localObject1);
          }
          localObject3 = String.valueOf(localObject4);
          if (((String)localObject3).length() != 0) {
            localObject3 = "get".concat((String)localObject3);
          } else {
            localObject3 = new String("get");
          }
          localObject5 = (Method)localHashMap1.get(localObject3);
          localObject3 = String.valueOf(localObject4);
          if (((String)localObject3).length() != 0) {
            localObject3 = "has".concat((String)localObject3);
          } else {
            localObject3 = new String("has");
          }
          localObject3 = (Method)localHashMap1.get(localObject3);
          if (localObject5 != null)
          {
            localObject4 = sx.a((Method)localObject5, paramby, new Object[0]);
            if (localObject3 == null)
            {
              if ((localObject4 instanceof Boolean)) {
                if (((Boolean)localObject4).booleanValue()) {}
              }
              for (;;)
              {
                bool1 = true;
                break;
                label864:
                label888:
                label955:
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
                          break label977;
                          if (!(localObject4 instanceof Integer)) {
                            break;
                          }
                        } while (((Integer)localObject4).intValue() != 0);
                        break;
                        if (!(localObject4 instanceof Float)) {
                          break label864;
                        }
                      } while (((Float)localObject4).floatValue() != 0.0F);
                      break;
                      if (!(localObject4 instanceof Double)) {
                        break label888;
                      }
                    } while (((Double)localObject4).doubleValue() != 0.0D);
                    break;
                    if ((localObject4 instanceof String))
                    {
                      bool1 = localObject4.equals("");
                      break label977;
                    }
                    if ((localObject4 instanceof Ow))
                    {
                      bool1 = localObject4.equals(Ow.a);
                      break label977;
                    }
                    if (!(localObject4 instanceof by)) {
                      break label955;
                    }
                  } while (localObject4 != ((by)localObject4).na());
                  break;
                } while ((!(localObject4 instanceof Enum)) || (((Enum)localObject4).ordinal() != 0));
              }
              label977:
              if (!bool1) {
                bool1 = bool2;
              } else {
                bool1 = false;
              }
            }
            else
            {
              bool1 = ((Boolean)sx.a((Method)localObject3, paramby, new Object[0])).booleanValue();
            }
            if (bool1) {
              a(paramStringBuilder, paramInt, a((String)localObject1), localObject4);
            }
          }
        }
      }
    }
    if ((paramby instanceof sx.c))
    {
      localObject1 = ((sx.c)paramby).zzra.d();
      if (((Iterator)localObject1).hasNext())
      {
        ((Map.Entry)((Iterator)localObject1).next()).getKey();
        throw new NoSuchMethodError();
      }
    }
    paramby = ((sx)paramby).zzqu;
    if (paramby != null) {
      paramby.a(paramStringBuilder, paramInt);
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
      paramStringBuilder.append(Gy.a(Ow.a((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof Ow))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(Gy.a((Ow)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof sx))
    {
      paramStringBuilder.append(" {");
      a((sx)paramObject, paramStringBuilder, paramInt + 2);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */