import android.net.Uri;
import com.facebook.internal.S;
import com.facebook.p;
import org.json.JSONException;
import org.json.JSONObject;

final class wo
  implements vo.a
{
  public JSONObject a(Po paramPo)
  {
    paramPo = paramPo.a();
    if (S.d(paramPo))
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("url", paramPo.toString());
        return localJSONObject;
      }
      catch (JSONException paramPo)
      {
        throw new p("Unable to attach images", paramPo);
      }
    }
    throw new p("Only web images may be used in OG objects shared via the web dialog");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */