import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public final class zwa
{
  public static final zwa a = new zwa();
  
  private final Intent a(String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent("android.intent.action.SEND_MULTIPLE");
    localIntent.setType("text/plain");
    localIntent.putExtra("android.intent.extra.EMAIL", new String[] { paramString1 });
    localIntent.putExtra("android.intent.extra.SUBJECT", paramString2);
    localIntent.putExtra("android.intent.extra.TEXT", paramString3);
    return localIntent;
  }
  
  private final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n\n\n\n===================\nApp Version: 3.4.8\n");
    localStringBuilder.append("Android version: ");
    localStringBuilder.append(Build.VERSION.RELEASE);
    localStringBuilder.append(" (");
    localStringBuilder.append(Build.VERSION.SDK_INT);
    localStringBuilder.append(")\n");
    localStringBuilder.append("Device: ");
    localStringBuilder.append(Build.MODEL);
    localStringBuilder.append(" (");
    localStringBuilder.append(Build.DEVICE);
    localStringBuilder.append(")\n");
    localStringBuilder.append("Device Id: ");
    localStringBuilder.append((String)Uma.qa.m().get());
    localStringBuilder.append('\n');
    localStringBuilder.append("Device language: ");
    localStringBuilder.append(Locale.getDefault());
    return localStringBuilder.toString();
  }
  
  private final Intent b(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", paramString1, null));
    paramString1.putExtra("android.intent.extra.SUBJECT", paramString2);
    paramString1.putExtra("android.intent.extra.TEXT", paramString3);
    return paramString1;
  }
  
  public final Intent a(Context paramContext, String paramString, wwa paramwwa, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object localObject1 = paramString;
    oXa.b(paramContext, "context");
    oXa.b(localObject1, "message");
    oXa.b(paramwwa, "feedbackMode");
    if (paramBoolean1) {
      paramString = "support.android.pro@faceapp.com";
    } else {
      paramString = "support.android@faceapp.com";
    }
    Object localObject2 = localObject1;
    if (paramBoolean2)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(a());
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    localObject1 = paramContext.getString(2131690225);
    oXa.a(localObject1, "context.getString(R.string.send_feedback_subject)");
    paramwwa = zYa.a(zYa.a((String)localObject1, "{mode}", paramwwa.b(), false, 4, null), "{version_name}", "3.4.8", false, 4, null);
    if (paramBoolean3) {
      paramString = a(paramString, paramwwa, (String)localObject2);
    } else {
      paramString = b(paramString, paramwwa, (String)localObject2);
    }
    if (paramBoolean3)
    {
      localObject1 = _ra.h.f();
      paramwwa = new ArrayList();
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (File)((Iterator)localObject1).next();
        try
        {
          localObject2 = FileProvider.a(paramContext, "io.faceapp.fileprovider", (File)localObject2);
          paramwwa.add(localObject2);
        }
        catch (Exception paramContext)
        {
          asa.d.k("Feedback: error on preparing logFile URI");
          return null;
        }
      }
      if ((paramwwa.isEmpty() ^ true))
      {
        paramString.putParcelableArrayListExtra("android.intent.extra.STREAM", paramwwa);
        paramString.addFlags(1);
      }
      else
      {
        asa.d.k("Feedback: no logFiles found!");
      }
    }
    return Intent.createChooser(paramString, paramContext.getString(2131689895));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */