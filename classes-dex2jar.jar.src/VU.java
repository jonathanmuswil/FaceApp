import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class vu
{
  private static String a(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramString.length(); i++)
    {
      char c1 = paramString.charAt(i);
      if (i == 0) {}
      for (;;)
      {
        char c2 = Character.toLowerCase(c1);
        char c3 = c2;
        do
        {
          localStringBuffer.append(c3);
          break;
          c3 = c1;
        } while (!Character.isUpperCase(c1));
        localStringBuffer.append('_');
      }
    }
    return localStringBuffer.toString();
  }
  
  public static <T extends tu> String a(T paramT)
  {
    if (paramT == null) {
      return "";
    }
    StringBuffer localStringBuffer1 = new StringBuffer();
    try
    {
      StringBuffer localStringBuffer2 = new java/lang/StringBuffer;
      localStringBuffer2.<init>();
      a(null, paramT, localStringBuffer2, localStringBuffer1);
      return localStringBuffer1.toString();
    }
    catch (InvocationTargetException paramT)
    {
      paramT = String.valueOf(paramT.getMessage());
      if (paramT.length() != 0) {
        return "Error printing proto: ".concat(paramT);
      }
      return new String("Error printing proto: ");
    }
    catch (IllegalAccessException paramT)
    {
      paramT = String.valueOf(paramT.getMessage());
      if (paramT.length() != 0) {
        return "Error printing proto: ".concat(paramT);
      }
    }
    return new String("Error printing proto: ");
  }
  
  private static void a(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
    throws IllegalAccessException, InvocationTargetException
  {
    if (paramObject != null)
    {
      int m;
      if ((paramObject instanceof tu))
      {
        int i = paramStringBuffer1.length();
        if (paramString != null)
        {
          paramStringBuffer2.append(paramStringBuffer1);
          paramStringBuffer2.append(a(paramString));
          paramStringBuffer2.append(" <\n");
          paramStringBuffer1.append("  ");
        }
        Class localClass = paramObject.getClass();
        Object localObject4;
        for (Object localObject2 : localClass.getFields())
        {
          m = ((Field)localObject2).getModifiers();
          localObject3 = ((Field)localObject2).getName();
          if ((!"cachedSize".equals(localObject3)) && ((m & 0x1) == 1) && ((m & 0x8) != 8) && (!((String)localObject3).startsWith("_")) && (!((String)localObject3).endsWith("_")))
          {
            localObject4 = ((Field)localObject2).getType();
            localObject2 = ((Field)localObject2).get(paramObject);
            int n;
            if ((((Class)localObject4).isArray()) && (((Class)localObject4).getComponentType() != Byte.TYPE))
            {
              if (localObject2 == null) {
                m = 0;
              } else {
                m = Array.getLength(localObject2);
              }
              n = 0;
            }
            while (n < m)
            {
              a((String)localObject3, Array.get(localObject2, n), paramStringBuffer1, paramStringBuffer2);
              n++;
              continue;
              a((String)localObject3, localObject2, paramStringBuffer1, paramStringBuffer2);
            }
          }
        }
        Object localObject3 = localClass.getMethods();
        m = localObject3.length;
        ??? = 0;
        while (??? < m)
        {
          localObject4 = localObject3[???].getName();
          if (((String)localObject4).startsWith("set")) {
            ??? = ((String)localObject4).substring(3);
          }
          try
          {
            localObject4 = String.valueOf(???);
            if (((String)localObject4).length() != 0) {
              localObject4 = "has".concat((String)localObject4);
            } else {
              localObject4 = new String("has");
            }
            localObject4 = localClass.getMethod((String)localObject4, new Class[0]);
            if (((Boolean)((Method)localObject4).invoke(paramObject, new Object[0])).booleanValue())
            {
              localObject4 = String.valueOf(???);
              if (((String)localObject4).length() != 0) {
                localObject4 = "get".concat((String)localObject4);
              } else {
                localObject4 = new String("get");
              }
              localObject4 = localClass.getMethod((String)localObject4, new Class[0]);
              a((String)???, ((Method)localObject4).invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
            }
            ???++;
          }
          catch (NoSuchMethodException localNoSuchMethodException)
          {
            for (;;) {}
          }
        }
        if (paramString != null)
        {
          paramStringBuffer1.setLength(i);
          paramStringBuffer2.append(paramStringBuffer1);
          paramStringBuffer2.append(">\n");
        }
        return;
      }
      paramString = a(paramString);
      paramStringBuffer2.append(paramStringBuffer1);
      paramStringBuffer2.append(paramString);
      paramStringBuffer2.append(": ");
      if ((paramObject instanceof String))
      {
        paramObject = (String)paramObject;
        paramString = (String)paramObject;
        if (!((String)paramObject).startsWith("http"))
        {
          paramString = (String)paramObject;
          if (((String)paramObject).length() > 200) {
            paramString = String.valueOf(((String)paramObject).substring(0, 200)).concat("[...]");
          }
        }
        m = paramString.length();
        paramObject = new StringBuilder(m);
        for (??? = 0; ??? < m; ???++)
        {
          char c = paramString.charAt(???);
          if ((c >= ' ') && (c <= '~') && (c != '"') && (c != '\'')) {
            ((StringBuilder)paramObject).append(c);
          } else {
            ((StringBuilder)paramObject).append(String.format("\\u%04x", new Object[] { Integer.valueOf(c) }));
          }
        }
        paramString = ((StringBuilder)paramObject).toString();
        paramStringBuffer2.append("\"");
        paramStringBuffer2.append(paramString);
        paramStringBuffer2.append("\"");
      }
      else if ((paramObject instanceof byte[]))
      {
        paramString = (byte[])paramObject;
        if (paramString == null)
        {
          paramStringBuffer2.append("\"\"");
        }
        else
        {
          paramStringBuffer2.append('"');
          for (??? = 0; ??? < paramString.length; ???++)
          {
            m = paramString[???] & 0xFF;
            if ((m != 92) && (m != 34))
            {
              if ((m < 32) || (m >= 127))
              {
                paramStringBuffer2.append(String.format("\\%03o", new Object[] { Integer.valueOf(m) }));
                continue;
              }
            }
            else {
              paramStringBuffer2.append('\\');
            }
            paramStringBuffer2.append((char)m);
          }
          paramStringBuffer2.append('"');
        }
      }
      else
      {
        paramStringBuffer2.append(paramObject);
      }
      paramStringBuffer2.append("\n");
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */