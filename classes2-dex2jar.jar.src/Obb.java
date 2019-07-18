import java.io.IOException;
import java.lang.reflect.Array;

class obb
  extends pbb<Object>
{
  obb(pbb parampbb) {}
  
  void a(rbb paramrbb, Object paramObject)
    throws IOException
  {
    if (paramObject == null) {
      return;
    }
    int i = 0;
    int j = Array.getLength(paramObject);
    while (i < j)
    {
      this.a.a(paramrbb, Array.get(paramObject, i));
      i++;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/obb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */