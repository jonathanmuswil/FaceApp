import com.facebook.E.b;
import com.facebook.I;
import com.facebook.t;
import org.json.JSONException;
import org.json.JSONObject;

class ro
  implements E.b
{
  ro(uo paramuo) {}
  
  public void a(I paramI)
  {
    Object localObject = paramI.a();
    if (localObject != null)
    {
      uo.a(this.a, (t)localObject);
      return;
    }
    paramI = paramI.b();
    localObject = new uo.a();
    try
    {
      ((uo.a)localObject).a(paramI.getString("user_code"));
      ((uo.a)localObject).a(paramI.getLong("expires_in"));
      uo.a(this.a, (uo.a)localObject);
      return;
    }
    catch (JSONException paramI)
    {
      uo.a(this.a, new t(0, "", "Malformed server response"));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */