import android.os.Bundle;
import com.facebook.E;
import com.facebook.b;
import java.util.List;

final class una<T>
  implements _Qa<T>
{
  una(b paramb) {}
  
  public final void a(YQa<List<Yea>> paramYQa)
  {
    oXa.b(paramYQa, "subscriber");
    E localE = E.a(this.a, "/me/albums", new tna(paramYQa));
    oXa.a(localE, "request");
    paramYQa = new Bundle();
    paramYQa.putString("fields", "id,type");
    paramYQa.putInt("limit", 100);
    localE.a(paramYQa);
    localE.b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/una.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */