package io.faceapp.services.firebase;

import Ora.a;
import Ora.a.f;
import Ora.a.g;
import Sra;
import WVa;
import _Va;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.app.ca.c;
import asa;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.c;
import io.faceapp.MainActivity;
import java.util.Map;
import oXa;
import org.json.JSONObject;

public final class FAFirebaseMessagingService
  extends FirebaseMessagingService
{
  public static final b g = new b(null);
  
  private final WVa<String, String> a(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.getJSONObject("alert");
    oXa.a(paramJSONObject, "alert");
    return new WVa(a(paramJSONObject, "title"), a(paramJSONObject, "body"));
  }
  
  private final String a(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.getString(paramString);
    if (!(oXa.a(paramJSONObject, "null") ^ true)) {
      paramJSONObject = null;
    }
    return paramJSONObject;
  }
  
  private final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, Ora.a parama)
  {
    g.a(this, paramInt1, paramInt2, a.b, paramString1, paramString2, parama);
  }
  
  private final void a(String paramString1, String paramString2)
  {
    b.a(g, this, 0, 0, a.a, paramString1, paramString2, null, 64, null);
  }
  
  private final void a(String paramString1, String paramString2, c paramc)
  {
    Object localObject = paramc.a().getString("poll_id");
    oXa.a(localObject, "pollId");
    localObject = new Ora.a.g((String)localObject);
    a(paramc.b(), paramc.c(), paramString1, paramString2, (Ora.a)localObject);
  }
  
  private final void a(Map<String, String> paramMap)
  {
    Object localObject = a(new JSONObject((String)paramMap.get("aps")));
    String str = (String)((WVa)localObject).a();
    localObject = (String)((WVa)localObject).b();
    paramMap = (String)paramMap.get("update");
    if (paramMap != null) {
      paramMap = new JSONObject(paramMap);
    } else {
      paramMap = null;
    }
    if (paramMap == null)
    {
      a(str, (String)localObject);
      return;
    }
    if (Sra.a.b())
    {
      c localc = c.a.a(paramMap);
      paramMap = localc.d();
      int i = paramMap.hashCode();
      if (i != -933433123)
      {
        if (i != 12901850)
        {
          if ((i == 674958179) && (paramMap.equals("voting.new_votes"))) {
            b(str, (String)localObject, localc);
          }
        }
        else if (paramMap.equals("voting.new_friend_poll")) {
          a(str, (String)localObject, localc);
        }
      }
      else if (paramMap.equals("voting.poll_results")) {
        c(str, (String)localObject, localc);
      }
    }
  }
  
  private final void b(String paramString1, String paramString2, c paramc)
  {
    Object localObject = paramc.a().getString("poll_id");
    oXa.a(localObject, "pollId");
    localObject = new Ora.a.f((String)localObject);
    a(paramc.b(), paramc.c(), paramString1, paramString2, (Ora.a)localObject);
  }
  
  private final void c(String paramString1, String paramString2, c paramc)
  {
    Object localObject = paramc.a().getString("poll_id");
    oXa.a(localObject, "pollId");
    localObject = new Ora.a.f((String)localObject);
    a(paramc.b(), paramc.c(), paramString1, paramString2, (Ora.a)localObject);
  }
  
  public void a(c paramc)
  {
    super.a(paramc);
    if (paramc != null)
    {
      paramc = paramc.y();
      if (paramc != null) {
        a(paramc);
      } else {
        asa.d.k("Got RemoteMessage with no Data infos");
      }
    }
  }
  
  public static enum a
  {
    private final String d;
    private final String e;
    
    static
    {
      a locala1 = new a("GENERAL", 0, "general", "General");
      a = locala1;
      a locala2 = new a("SOCIAL", 1, "social", "Social");
      b = locala2;
      c = new a[] { locala1, locala2 };
    }
    
    private a(String paramString1, String paramString2)
    {
      this.d = paramString1;
      this.e = paramString2;
    }
    
    public final String a()
    {
      return this.e;
    }
    
    public final String getId()
    {
      return this.d;
    }
  }
  
  public static final class b
  {
    private final void a(Context paramContext, FAFirebaseMessagingService.a parama)
    {
      if (Build.VERSION.SDK_INT >= 26)
      {
        parama = new NotificationChannel(parama.getId(), parama.a(), 3);
        paramContext = paramContext.getSystemService("notification");
        if (paramContext != null) {
          ((NotificationManager)paramContext).createNotificationChannel(parama);
        } else {
          throw new _Va("null cannot be cast to non-null type android.app.NotificationManager");
        }
      }
    }
    
    public final void a(Context paramContext, int paramInt1, int paramInt2, FAFirebaseMessagingService.a parama, String paramString1, String paramString2, Ora.a parama1)
    {
      oXa.b(paramContext, "context");
      oXa.b(parama, "channel");
      a(paramContext, parama);
      Object localObject = new Intent(paramContext, MainActivity.class);
      ((Intent)localObject).addFlags(67108864);
      if (parama1 != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("faceapp://notifications/?event_id=");
        localStringBuilder.append(paramInt1);
        localStringBuilder.append('&');
        localStringBuilder.append(parama1.a());
        ((Intent)localObject).setData(Uri.parse(localStringBuilder.toString()));
      }
      localObject = PendingIntent.getActivity(paramContext, 0, (Intent)localObject, 1073741824);
      parama1 = RingtoneManager.getDefaultUri(2);
      parama = new ca.c(paramContext, parama.getId());
      parama.c(2131231019);
      if (paramString1 == null) {
        paramString1 = paramContext.getString(2131689479);
      }
      parama.c(paramString1);
      parama.b(paramString2);
      parama.a(parama1);
      parama.a((PendingIntent)localObject);
      parama.b(0);
      parama.a(true);
      paramContext = paramContext.getSystemService("notification");
      if (paramContext != null)
      {
        ((NotificationManager)paramContext).notify(paramInt2, parama.a());
        return;
      }
      throw new _Va("null cannot be cast to non-null type android.app.NotificationManager");
    }
  }
  
  public static final class c
  {
    public static final a a = new a(null);
    private final int b;
    private final int c;
    private final String d;
    private final JSONObject e;
    
    public c(int paramInt1, int paramInt2, String paramString, JSONObject paramJSONObject)
    {
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramString;
      this.e = paramJSONObject;
    }
    
    public final JSONObject a()
    {
      return this.e;
    }
    
    public final int b()
    {
      return this.b;
    }
    
    public final int c()
    {
      return this.c;
    }
    
    public final String d()
    {
      return this.d;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          int i;
          if (this.b == ((c)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.c == ((c)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (oXa.a(this.d, ((c)paramObject).d)) && (oXa.a(this.e, ((c)paramObject).e))) {
              break label94;
            }
          }
        }
        return false;
      }
      label94:
      return true;
    }
    
    public int hashCode()
    {
      int i = this.b;
      int j = this.c;
      Object localObject = this.d;
      int k = 0;
      int m;
      if (localObject != null) {
        m = ((String)localObject).hashCode();
      } else {
        m = 0;
      }
      localObject = this.e;
      if (localObject != null) {
        k = localObject.hashCode();
      }
      return ((i * 31 + j) * 31 + m) * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("UpdateInfo(eventId=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", groupId=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", updateType=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(", data=");
      localStringBuilder.append(this.e);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
    
    public static final class a
    {
      public final FAFirebaseMessagingService.c a(JSONObject paramJSONObject)
      {
        oXa.b(paramJSONObject, "obj");
        int i = paramJSONObject.getInt("id");
        int j = paramJSONObject.getInt("group_id");
        String str = paramJSONObject.getString("update_type");
        oXa.a(str, "obj.getString(\"update_type\")");
        paramJSONObject = paramJSONObject.getJSONObject("data");
        oXa.a(paramJSONObject, "obj.getJSONObject(\"data\")");
        return new FAFirebaseMessagingService.c(i, j, str, paramJSONObject);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/services/firebase/FAFirebaseMessagingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */