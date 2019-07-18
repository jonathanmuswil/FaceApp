import java.io.IOException;
import java.util.Map.Entry;

final class jx
  extends ix<Object>
{
  final int a(Map.Entry<?, ?> paramEntry)
  {
    paramEntry.getKey();
    throw new NoSuchMethodError();
  }
  
  final lx<Object> a(Object paramObject)
  {
    return ((sx.c)paramObject).zzra;
  }
  
  final void a(dz paramdz, Map.Entry<?, ?> paramEntry)
    throws IOException
  {
    paramEntry.getKey();
    throw new NoSuchMethodError();
  }
  
  final boolean a(by paramby)
  {
    return paramby instanceof sx.c;
  }
  
  final lx<Object> b(Object paramObject)
  {
    paramObject = (sx.c)paramObject;
    if (((sx.c)paramObject).zzra.b()) {
      ((sx.c)paramObject).zzra = ((lx)((sx.c)paramObject).zzra.clone());
    }
    return ((sx.c)paramObject).zzra;
  }
  
  final void c(Object paramObject)
  {
    a(paramObject).e();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */