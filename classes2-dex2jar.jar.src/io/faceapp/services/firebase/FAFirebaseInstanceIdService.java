package io.faceapp.services.firebase;

import Hm;
import Uma;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import icb;
import icb.a;
import oXa;

public final class FAFirebaseInstanceIdService
  extends FirebaseInstanceIdService
{
  public void a()
  {
    Object localObject = FirebaseInstanceId.b();
    oXa.a(localObject, "FirebaseInstanceId.getInstance()");
    String str = ((FirebaseInstanceId)localObject).c();
    icb.a locala = icb.a("FirebaseMessaging");
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Refreshed token: ");
    ((StringBuilder)localObject).append(str);
    locala.a(((StringBuilder)localObject).toString(), new Object[0]);
    if (str != null) {
      Uma.qa.r().set(str);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/services/firebase/FAFirebaseInstanceIdService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */