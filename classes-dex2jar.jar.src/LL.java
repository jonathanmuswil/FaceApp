import android.text.TextUtils;
import java.util.HashMap;

class ll
  extends HashMap<String, Object>
{
  ll(ml paramml)
  {
    put("app_identifier", this.a.a);
    put("api_key", Cl.d(this.a.f).a);
    put("version_code", this.a.b);
    put("version_name", this.a.c);
    put("install_uuid", this.a.d);
    put("delivery_mechanism", Integer.valueOf(this.a.e));
    if (TextUtils.isEmpty(Cl.e(this.a.f))) {
      paramml = "";
    } else {
      paramml = Cl.e(this.a.f);
    }
    put("unity_version", paramml);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */