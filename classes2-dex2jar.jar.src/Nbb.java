import java.io.IOException;
import java.util.Iterator;

class nbb
  extends pbb<Iterable<T>>
{
  nbb(pbb parampbb) {}
  
  void a(rbb paramrbb, Iterable<T> paramIterable)
    throws IOException
  {
    if (paramIterable == null) {
      return;
    }
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      Object localObject = paramIterable.next();
      this.a.a(paramrbb, localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */