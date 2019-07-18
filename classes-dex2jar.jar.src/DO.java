import android.content.Context;
import com.facebook.FacebookSdk;
import java.util.ArrayList;

class do
  implements Runnable
{
  do(eo parameo) {}
  
  public void run()
  {
    Context localContext = FacebookSdk.d();
    ArrayList localArrayList1 = go.b(localContext, fo.a());
    ArrayList localArrayList2 = localArrayList1;
    if (localArrayList1.isEmpty()) {
      localArrayList2 = go.a(localContext, fo.a());
    }
    fo.a(localContext, localArrayList2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */