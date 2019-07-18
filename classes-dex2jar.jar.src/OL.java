import android.os.Build.VERSION;
import java.util.HashMap;

class ol
  extends HashMap<String, Object>
{
  ol(pl parampl)
  {
    put("version", Build.VERSION.RELEASE);
    put("build_version", Build.VERSION.CODENAME);
    put("is_rooted", Boolean.valueOf(this.a.a));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */