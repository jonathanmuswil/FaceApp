import android.os.Bundle;
import com.facebook.E;
import com.facebook.b;
import java.util.List;

final class lna<T>
  implements _Qa<T>
{
  lna(b paramb, String paramString) {}
  
  public final void a(YQa<List<_ea>> paramYQa)
  {
    oXa.b(paramYQa, "subscriber");
    Object localObject = this.a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('/');
    localStringBuilder.append(this.b);
    localStringBuilder.append("/photos");
    paramYQa = E.a((b)localObject, localStringBuilder.toString(), new kna(paramYQa));
    oXa.a(paramYQa, "request");
    localObject = new Bundle();
    ((Bundle)localObject).putString("fields", "id,images");
    ((Bundle)localObject).putInt("limit", 100);
    paramYQa.a((Bundle)localObject);
    paramYQa.b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */