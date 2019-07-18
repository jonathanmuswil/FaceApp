import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;

final class no
  implements NsdManager.RegistrationListener
{
  no(String paramString1, String paramString2) {}
  
  public void onRegistrationFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt)
  {
    oo.a(this.b);
  }
  
  public void onServiceRegistered(NsdServiceInfo paramNsdServiceInfo)
  {
    if (!this.a.equals(paramNsdServiceInfo.getServiceName())) {
      oo.a(this.b);
    }
  }
  
  public void onServiceUnregistered(NsdServiceInfo paramNsdServiceInfo) {}
  
  public void onUnregistrationFailed(NsdServiceInfo paramNsdServiceInfo, int paramInt) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */