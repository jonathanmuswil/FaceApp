import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.B;
import com.android.billingclient.api.D;
import com.android.billingclient.api.D.a;
import com.android.billingclient.api.F;
import com.android.billingclient.api.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

public final class ve
{
  public static int a = Runtime.getRuntime().availableProcessors();
  
  public static Bundle a(B paramB, boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("playBillingLibraryVersion", paramString);
    if (paramB.d() != 0) {
      localBundle.putInt("prorationMode", paramB.d());
    }
    if (!TextUtils.isEmpty(paramB.a())) {
      localBundle.putString("accountId", paramB.a());
    }
    if (paramB.h()) {
      localBundle.putBoolean("vr", true);
    }
    if (!TextUtils.isEmpty(paramB.c())) {
      localBundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[] { paramB.c() })));
    }
    if (!TextUtils.isEmpty(paramB.b())) {
      localBundle.putString("developerId", paramB.b());
    }
    if ((paramBoolean1) && (paramBoolean2)) {
      localBundle.putBoolean("enablePendingPurchases", true);
    }
    return localBundle;
  }
  
  public static Bundle a(b paramb, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("playBillingLibraryVersion", paramString);
    paramb = paramb.a();
    if (!TextUtils.isEmpty(paramb)) {
      localBundle.putString("developerPayload", paramb);
    }
    return localBundle;
  }
  
  public static Bundle a(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    Bundle localBundle = new Bundle();
    if (paramBoolean1) {
      localBundle.putString("playBillingLibraryVersion", paramString);
    }
    if ((paramBoolean1) && (paramBoolean2)) {
      localBundle.putBoolean("enablePendingPurchases", true);
    }
    return localBundle;
  }
  
  public static D a(Intent paramIntent, String paramString)
  {
    if (paramIntent == null)
    {
      b("BillingHelper", "Got null intent!");
      paramIntent = D.c();
      paramIntent.a(6);
      paramIntent.a("An internal error occurred.");
      return paramIntent.a();
    }
    D.a locala = D.c();
    locala.a(b(paramIntent.getExtras(), paramString));
    locala.a(a(paramIntent.getExtras(), paramString));
    return locala.a();
  }
  
  public static String a(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null)
    {
      b(paramString, "Unexpected null bundle received!");
      return "";
    }
    Object localObject = paramBundle.get("DEBUG_MESSAGE");
    if (localObject == null)
    {
      a(paramString, "getDebugMessageFromBundle() got null response code, assuming OK");
      return "";
    }
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Unexpected type for debug message: ");
    paramBundle.append(localObject.getClass().getName());
    b(paramString, paramBundle.toString());
    return "";
  }
  
  public static List<F> a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    ArrayList localArrayList1 = paramBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
    ArrayList localArrayList2 = paramBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
    ArrayList localArrayList3 = new ArrayList();
    int i;
    if ((localArrayList1 != null) && (localArrayList2 != null)) {
      i = 0;
    }
    while ((i < localArrayList1.size()) && (i < localArrayList2.size()))
    {
      paramBundle = c((String)localArrayList1.get(i), (String)localArrayList2.get(i));
      if (paramBundle != null) {
        localArrayList3.add(paramBundle);
      }
      i++;
      continue;
      b("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
      paramBundle = c(paramBundle.getString("INAPP_PURCHASE_DATA"), paramBundle.getString("INAPP_DATA_SIGNATURE"));
      if (paramBundle == null)
      {
        b("BillingHelper", "Couldn't find single purchase data as well.");
        return null;
      }
      localArrayList3.add(paramBundle);
    }
    return localArrayList3;
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (Log.isLoggable(paramString1, 2)) {
      Log.v(paramString1, paramString2);
    }
  }
  
  public static int b(Intent paramIntent, String paramString)
  {
    return a(paramIntent, paramString).b();
  }
  
  public static int b(Bundle paramBundle, String paramString)
  {
    if (paramBundle == null)
    {
      b(paramString, "Unexpected null bundle received!");
      return 6;
    }
    Object localObject = paramBundle.get("RESPONSE_CODE");
    if (localObject == null)
    {
      a(paramString, "getResponseCodeFromBundle() got null response code, assuming OK");
      return 0;
    }
    if ((localObject instanceof Integer)) {
      return ((Integer)localObject).intValue();
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Unexpected type for bundle response code: ");
    paramBundle.append(localObject.getClass().getName());
    b(paramString, paramBundle.toString());
    return 6;
  }
  
  public static Bundle b(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("playBillingLibraryVersion", paramString);
    if ((paramBoolean1) && (paramBoolean2)) {
      localBundle.putBoolean("enablePendingPurchases", true);
    }
    return localBundle;
  }
  
  public static void b(String paramString1, String paramString2)
  {
    if (Log.isLoggable(paramString1, 5)) {
      Log.w(paramString1, paramString2);
    }
  }
  
  private static F c(String paramString1, String paramString2)
  {
    Object localObject = null;
    if ((paramString1 != null) && (paramString2 != null))
    {
      try
      {
        F localF = new com/android/billingclient/api/F;
        localF.<init>(paramString1, paramString2);
        paramString1 = localF;
      }
      catch (JSONException paramString2)
      {
        paramString1 = new StringBuilder();
        paramString1.append("Got JSONException while parsing purchase data: ");
        paramString1.append(paramString2);
        b("BillingHelper", paramString1.toString());
        paramString1 = (String)localObject;
      }
      return paramString1;
    }
    b("BillingHelper", "Received a bad purchase data.");
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */