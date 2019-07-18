import android.os.Bundle;
import android.support.v4.app.l;
import java.util.ArrayList;

public final class zOa$a
{
  public final zOa a(String paramString, ArrayList<String> paramArrayList)
  {
    oXa.b(paramString, "initComment");
    oXa.b(paramArrayList, "suggestedComments");
    zOa localzOa = new zOa();
    Bundle localBundle = new Bundle();
    localBundle.putString("init_comment", paramString);
    localBundle.putStringArrayList("suggested_comments", paramArrayList);
    localzOa.m(localBundle);
    return localzOa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zOa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */