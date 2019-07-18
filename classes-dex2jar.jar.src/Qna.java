import android.os.Bundle;
import com.facebook.E;
import com.facebook.b;

final class qna<T>
  implements _Qa<T>
{
  qna(b paramb) {}
  
  public final void a(YQa<String> paramYQa)
  {
    oXa.b(paramYQa, "subscriber");
    E localE = E.a(this.a, "/me", new pna(paramYQa));
    oXa.a(localE, "request");
    paramYQa = new Bundle();
    paramYQa.putString("fields", "picture.width(200){cache_key},albums.limit(100){id,type}");
    localE.a(paramYQa);
    localE.b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */