import android.os.Bundle;
import com.android.billingclient.api.I;
import com.google.firebase.analytics.FirebaseAnalytics;

final class csa
  extends pXa
  implements dXa<I, Double, cWa>
{
  public static final csa b = new csa();
  
  csa()
  {
    super(2);
  }
  
  public final void a(I paramI, double paramDouble)
  {
    oXa.b(paramI, "skuDetails");
    Bundle localBundle = new Bundle();
    localBundle.putInt("quantity", 1);
    localBundle.putString("item_id", paramI.c());
    localBundle.putDouble("value", paramDouble);
    localBundle.putString("currency", "USD");
    asa.a(asa.d).a("add_to_cart", localBundle);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/csa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */