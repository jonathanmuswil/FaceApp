import android.webkit.WebSettings;
import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;

final class ria
  extends pXa
  implements bXa<String>
{
  public static final ria b = new ria();
  
  ria()
  {
    super(0);
  }
  
  public final String b()
  {
    Object localObject1 = WebSettings.getDefaultUserAgent(FaceApplication.d.a());
    Object localObject2 = new xYa("\\s\\((.*?)\\)");
    oXa.a(localObject1, "defaultUa");
    localObject2 = xYa.a((xYa)localObject2, (CharSequence)localObject1, 0, 2, null);
    int i = 1;
    if (localObject2 != null)
    {
      localObject2 = ((tYa)localObject2).a();
      if (localObject2 != null)
      {
        localObject2 = ((rYa)localObject2).get(1);
        if (localObject2 != null)
        {
          localObject2 = ((qYa)localObject2).a();
          if (localObject2 != null) {
            break label79;
          }
        }
      }
    }
    localObject2 = "";
    label79:
    localObject1 = "FaceApp/3.4.8";
    if (((CharSequence)localObject2).length() <= 0) {
      i = 0;
    }
    if (i != 0)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("FaceApp/3.4.8");
      ((StringBuilder)localObject1).append(" (");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(')');
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    return new xYa("[^\\x00-\\x7F]").a((CharSequence)localObject1, "");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ria.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */