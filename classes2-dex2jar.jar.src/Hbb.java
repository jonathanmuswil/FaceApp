import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

final class hbb<ResponseT, ReturnT>
  extends wbb<ReturnT>
{
  private final sbb a;
  private final YYa.a b;
  private final Sab<ResponseT, ReturnT> c;
  private final Zab<DZa, ResponseT> d;
  
  private hbb(sbb paramsbb, YYa.a parama, Sab<ResponseT, ReturnT> paramSab, Zab<DZa, ResponseT> paramZab)
  {
    this.a = paramsbb;
    this.b = parama;
    this.c = paramSab;
    this.d = paramZab;
  }
  
  private static <ResponseT> Zab<DZa, ResponseT> a(vbb paramvbb, Method paramMethod, Type paramType)
  {
    Annotation[] arrayOfAnnotation = paramMethod.getAnnotations();
    try
    {
      paramvbb = paramvbb.b(paramType, arrayOfAnnotation);
      return paramvbb;
    }
    catch (RuntimeException paramvbb)
    {
      throw xbb.a(paramMethod, paramvbb, "Unable to create converter for %s", new Object[] { paramType });
    }
  }
  
  static <ResponseT, ReturnT> hbb<ResponseT, ReturnT> a(vbb paramvbb, Method paramMethod, sbb paramsbb)
  {
    Sab localSab = b(paramvbb, paramMethod);
    Type localType = localSab.a();
    if ((localType != tbb.class) && (localType != BZa.class))
    {
      if ((paramsbb.c.equals("HEAD")) && (!Void.class.equals(localType))) {
        throw xbb.a(paramMethod, "HEAD method must use Void as response type.", new Object[0]);
      }
      paramMethod = a(paramvbb, paramMethod, localType);
      return new hbb(paramsbb, paramvbb.b, localSab, paramMethod);
    }
    paramvbb = new StringBuilder();
    paramvbb.append("'");
    paramvbb.append(xbb.c(localType).getName());
    paramvbb.append("' is not a valid response body type. Did you mean ResponseBody?");
    throw xbb.a(paramMethod, paramvbb.toString(), new Object[0]);
  }
  
  private static <ResponseT, ReturnT> Sab<ResponseT, ReturnT> b(vbb paramvbb, Method paramMethod)
  {
    Type localType = paramMethod.getGenericReturnType();
    Annotation[] arrayOfAnnotation = paramMethod.getAnnotations();
    try
    {
      paramvbb = paramvbb.a(localType, arrayOfAnnotation);
      return paramvbb;
    }
    catch (RuntimeException paramvbb)
    {
      throw xbb.a(paramMethod, paramvbb, "Unable to create call adapter for %s", new Object[] { localType });
    }
  }
  
  ReturnT a(Object[] paramArrayOfObject)
  {
    return (ReturnT)this.c.a(new lbb(this.a, paramArrayOfObject, this.b, this.d));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */