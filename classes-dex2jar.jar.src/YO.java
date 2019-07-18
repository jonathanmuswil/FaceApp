import android.os.Bundle;
import com.facebook.internal.S;
import com.facebook.p;
import org.json.JSONException;
import org.json.JSONObject;

public class yo
{
  public static Bundle a(Do paramDo)
  {
    Bundle localBundle = a(paramDo);
    S.a(localBundle, "href", paramDo.a());
    S.a(localBundle, "quote", paramDo.c());
    return localBundle;
  }
  
  public static Bundle a(Ko paramKo)
  {
    Bundle localBundle = a(paramKo);
    S.a(localBundle, "action_type", paramKo.c().c());
    try
    {
      paramKo = xo.a(xo.a(paramKo), false);
      if (paramKo != null) {
        S.a(localBundle, "action_properties", paramKo.toString());
      }
      return localBundle;
    }
    catch (JSONException paramKo)
    {
      throw new p("Unable to serialize the ShareOpenGraphContent to JSON", paramKo);
    }
  }
  
  public static Bundle a(zo paramzo)
  {
    Bundle localBundle = new Bundle();
    paramzo = paramzo.b();
    if (paramzo != null) {
      S.a(localBundle, "hashtag", paramzo.a());
    }
    return localBundle;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */