import android.content.Context;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

class co
  implements Runnable
{
  co(eo parameo) {}
  
  public void run()
  {
    Context localContext = FacebookSdk.d();
    fo.a(localContext, go.b(localContext, fo.a()));
    Map localMap = go.c(localContext, fo.a());
    Iterator localIterator = go.d(localContext, fo.a()).iterator();
    while (localIterator.hasNext()) {
      localMap.put((String)localIterator.next(), mo.c);
    }
    fo.a(localContext, localMap);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */