import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

class S_a$a
  implements InvocationHandler
{
  private final List<String> a;
  boolean b;
  String c;
  
  S_a$a(List<String> paramList)
  {
    this.a = paramList;
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    throws Throwable
  {
    String str = paramMethod.getName();
    Class localClass = paramMethod.getReturnType();
    paramObject = paramArrayOfObject;
    if (paramArrayOfObject == null) {
      paramObject = LZa.b;
    }
    if ((str.equals("supports")) && (Boolean.TYPE == localClass)) {
      return Boolean.valueOf(true);
    }
    if ((str.equals("unsupported")) && (Void.TYPE == localClass))
    {
      this.b = true;
      return null;
    }
    if ((str.equals("protocols")) && (paramObject.length == 0)) {
      return this.a;
    }
    if (((str.equals("selectProtocol")) || (str.equals("select"))) && (String.class == localClass) && (paramObject.length == 1) && ((paramObject[0] instanceof List)))
    {
      paramObject = (List)paramObject[0];
      int i = ((List)paramObject).size();
      for (int j = 0; j < i; j++)
      {
        paramMethod = (String)((List)paramObject).get(j);
        if (this.a.contains(paramMethod))
        {
          this.c = paramMethod;
          return paramMethod;
        }
      }
      paramObject = (String)this.a.get(0);
      this.c = ((String)paramObject);
      return paramObject;
    }
    if (((str.equals("protocolSelected")) || (str.equals("selected"))) && (paramObject.length == 1))
    {
      this.c = ((String)paramObject[0]);
      return null;
    }
    return paramMethod.invoke(this, (Object[])paramObject);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/S_a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */