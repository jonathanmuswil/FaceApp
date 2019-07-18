package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class da
  implements ba
{
  private final Notification.Builder a;
  private final ca.c b;
  private RemoteViews c;
  private RemoteViews d;
  private final List<Bundle> e = new ArrayList();
  private final Bundle f = new Bundle();
  private int g;
  private RemoteViews h;
  
  da(ca.c paramc)
  {
    this.b = paramc;
    if (Build.VERSION.SDK_INT >= 26) {
      this.a = new Notification.Builder(paramc.a, paramc.I);
    } else {
      this.a = new Notification.Builder(paramc.a);
    }
    Object localObject1 = paramc.N;
    Object localObject2 = this.a.setWhen(((Notification)localObject1).when).setSmallIcon(((Notification)localObject1).icon, ((Notification)localObject1).iconLevel).setContent(((Notification)localObject1).contentView).setTicker(((Notification)localObject1).tickerText, paramc.h).setVibrate(((Notification)localObject1).vibrate).setLights(((Notification)localObject1).ledARGB, ((Notification)localObject1).ledOnMS, ((Notification)localObject1).ledOffMS);
    boolean bool;
    if ((((Notification)localObject1).flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject2 = ((Notification.Builder)localObject2).setOngoing(bool);
    if ((((Notification)localObject1).flags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject2 = ((Notification.Builder)localObject2).setOnlyAlertOnce(bool);
    if ((((Notification)localObject1).flags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject3 = ((Notification.Builder)localObject2).setAutoCancel(bool).setDefaults(((Notification)localObject1).defaults).setContentTitle(paramc.d).setContentText(paramc.e).setContentInfo(paramc.j).setContentIntent(paramc.f).setDeleteIntent(((Notification)localObject1).deleteIntent);
    localObject2 = paramc.g;
    if ((((Notification)localObject1).flags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    ((Notification.Builder)localObject3).setFullScreenIntent((PendingIntent)localObject2, bool).setLargeIcon(paramc.i).setNumber(paramc.k).setProgress(paramc.r, paramc.s, paramc.t);
    if (Build.VERSION.SDK_INT < 21) {
      this.a.setSound(((Notification)localObject1).sound, ((Notification)localObject1).audioStreamType);
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.a.setSubText(paramc.p).setUsesChronometer(paramc.n).setPriority(paramc.l);
      localObject2 = paramc.b.iterator();
      while (((Iterator)localObject2).hasNext()) {
        a((ca.a)((Iterator)localObject2).next());
      }
      localObject2 = paramc.B;
      if (localObject2 != null) {
        this.f.putAll((Bundle)localObject2);
      }
      if (Build.VERSION.SDK_INT < 20)
      {
        if (paramc.x) {
          this.f.putBoolean("android.support.localOnly", true);
        }
        localObject2 = paramc.u;
        if (localObject2 != null)
        {
          this.f.putString("android.support.groupKey", (String)localObject2);
          if (paramc.v) {
            this.f.putBoolean("android.support.isGroupSummary", true);
          } else {
            this.f.putBoolean("android.support.useSideChannel", true);
          }
        }
        localObject2 = paramc.w;
        if (localObject2 != null) {
          this.f.putString("android.support.sortKey", (String)localObject2);
        }
      }
      this.c = paramc.F;
      this.d = paramc.G;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      this.a.setShowWhen(paramc.m);
      if (Build.VERSION.SDK_INT < 21)
      {
        localObject2 = paramc.O;
        if ((localObject2 != null) && (!((ArrayList)localObject2).isEmpty()))
        {
          localObject3 = this.f;
          localObject2 = paramc.O;
          ((Bundle)localObject3).putStringArray("android.people", (String[])((ArrayList)localObject2).toArray(new String[((ArrayList)localObject2).size()]));
        }
      }
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      this.a.setLocalOnly(paramc.x).setGroup(paramc.u).setGroupSummary(paramc.v).setSortKey(paramc.w);
      this.g = paramc.M;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.a.setCategory(paramc.A).setColor(paramc.C).setVisibility(paramc.D).setPublicVersion(paramc.E).setSound(((Notification)localObject1).sound, ((Notification)localObject1).audioAttributes);
      localObject1 = paramc.O.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        this.a.addPerson((String)localObject2);
      }
      this.h = paramc.H;
      if (paramc.c.size() > 0)
      {
        localObject2 = paramc.b().getBundle("android.car.EXTENSIONS");
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = new Bundle();
        }
        localObject2 = new Bundle();
        for (int i = 0; i < paramc.c.size(); i++) {
          ((Bundle)localObject2).putBundle(Integer.toString(i), ea.a((ca.a)paramc.c.get(i)));
        }
        ((Bundle)localObject1).putBundle("invisible_actions", (Bundle)localObject2);
        paramc.b().putBundle("android.car.EXTENSIONS", (Bundle)localObject1);
        this.f.putBundle("android.car.EXTENSIONS", (Bundle)localObject1);
      }
    }
    if (Build.VERSION.SDK_INT >= 24)
    {
      this.a.setExtras(paramc.B).setRemoteInputHistory(paramc.q);
      localObject1 = paramc.F;
      if (localObject1 != null) {
        this.a.setCustomContentView((RemoteViews)localObject1);
      }
      localObject1 = paramc.G;
      if (localObject1 != null) {
        this.a.setCustomBigContentView((RemoteViews)localObject1);
      }
      localObject1 = paramc.H;
      if (localObject1 != null) {
        this.a.setCustomHeadsUpContentView((RemoteViews)localObject1);
      }
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      this.a.setBadgeIconType(paramc.J).setShortcutId(paramc.K).setTimeoutAfter(paramc.L).setGroupAlertBehavior(paramc.M);
      if (paramc.z) {
        this.a.setColorized(paramc.y);
      }
      if (!TextUtils.isEmpty(paramc.I)) {
        this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
      }
    }
  }
  
  private void a(Notification paramNotification)
  {
    paramNotification.sound = null;
    paramNotification.vibrate = null;
    paramNotification.defaults &= 0xFFFFFFFE;
    paramNotification.defaults &= 0xFFFFFFFD;
  }
  
  private void a(ca.a parama)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 20)
    {
      Notification.Action.Builder localBuilder = new Notification.Action.Builder(parama.e(), parama.i(), parama.a());
      Object localObject;
      if (parama.f() != null)
      {
        localObject = ga.a(parama.f());
        int j = localObject.length;
        for (i = 0; i < j; i++) {
          localBuilder.addRemoteInput(localObject[i]);
        }
      }
      if (parama.d() != null) {
        localObject = new Bundle(parama.d());
      } else {
        localObject = new Bundle();
      }
      ((Bundle)localObject).putBoolean("android.support.allowGeneratedReplies", parama.b());
      if (Build.VERSION.SDK_INT >= 24) {
        localBuilder.setAllowGeneratedReplies(parama.b());
      }
      ((Bundle)localObject).putInt("android.support.action.semanticAction", parama.g());
      if (Build.VERSION.SDK_INT >= 28) {
        localBuilder.setSemanticAction(parama.g());
      }
      ((Bundle)localObject).putBoolean("android.support.action.showsUserInterface", parama.h());
      localBuilder.addExtras((Bundle)localObject);
      this.a.addAction(localBuilder.build());
    }
    else if (i >= 16)
    {
      this.e.add(ea.a(this.a, parama));
    }
  }
  
  public Notification.Builder a()
  {
    return this.a;
  }
  
  public Notification b()
  {
    ca.d locald = this.b.o;
    if (locald != null) {
      locald.a(this);
    }
    Object localObject;
    if (locald != null) {
      localObject = locald.c(this);
    } else {
      localObject = null;
    }
    Notification localNotification = c();
    if (localObject != null)
    {
      localNotification.contentView = ((RemoteViews)localObject);
    }
    else
    {
      localObject = this.b.F;
      if (localObject != null) {
        localNotification.contentView = ((RemoteViews)localObject);
      }
    }
    if ((Build.VERSION.SDK_INT >= 16) && (locald != null))
    {
      localObject = locald.b(this);
      if (localObject != null) {
        localNotification.bigContentView = ((RemoteViews)localObject);
      }
    }
    if ((Build.VERSION.SDK_INT >= 21) && (locald != null))
    {
      localObject = this.b.o.d(this);
      if (localObject != null) {
        localNotification.headsUpContentView = ((RemoteViews)localObject);
      }
    }
    if ((Build.VERSION.SDK_INT >= 16) && (locald != null))
    {
      localObject = ca.a(localNotification);
      if (localObject != null) {
        locald.a((Bundle)localObject);
      }
    }
    return localNotification;
  }
  
  protected Notification c()
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      return this.a.build();
    }
    Object localObject1;
    if (i >= 24)
    {
      localObject1 = this.a.build();
      if (this.g != 0)
      {
        if ((((Notification)localObject1).getGroup() != null) && ((((Notification)localObject1).flags & 0x200) != 0) && (this.g == 2)) {
          a((Notification)localObject1);
        }
        if ((((Notification)localObject1).getGroup() != null) && ((((Notification)localObject1).flags & 0x200) == 0) && (this.g == 1)) {
          a((Notification)localObject1);
        }
      }
      return (Notification)localObject1;
    }
    Object localObject2;
    if (i >= 21)
    {
      this.a.setExtras(this.f);
      localObject1 = this.a.build();
      localObject2 = this.c;
      if (localObject2 != null) {
        ((Notification)localObject1).contentView = ((RemoteViews)localObject2);
      }
      localObject2 = this.d;
      if (localObject2 != null) {
        ((Notification)localObject1).bigContentView = ((RemoteViews)localObject2);
      }
      localObject2 = this.h;
      if (localObject2 != null) {
        ((Notification)localObject1).headsUpContentView = ((RemoteViews)localObject2);
      }
      if (this.g != 0)
      {
        if ((((Notification)localObject1).getGroup() != null) && ((((Notification)localObject1).flags & 0x200) != 0) && (this.g == 2)) {
          a((Notification)localObject1);
        }
        if ((((Notification)localObject1).getGroup() != null) && ((((Notification)localObject1).flags & 0x200) == 0) && (this.g == 1)) {
          a((Notification)localObject1);
        }
      }
      return (Notification)localObject1;
    }
    if (i >= 20)
    {
      this.a.setExtras(this.f);
      localObject1 = this.a.build();
      localObject2 = this.c;
      if (localObject2 != null) {
        ((Notification)localObject1).contentView = ((RemoteViews)localObject2);
      }
      localObject2 = this.d;
      if (localObject2 != null) {
        ((Notification)localObject1).bigContentView = ((RemoteViews)localObject2);
      }
      if (this.g != 0)
      {
        if ((((Notification)localObject1).getGroup() != null) && ((((Notification)localObject1).flags & 0x200) != 0) && (this.g == 2)) {
          a((Notification)localObject1);
        }
        if ((((Notification)localObject1).getGroup() != null) && ((((Notification)localObject1).flags & 0x200) == 0) && (this.g == 1)) {
          a((Notification)localObject1);
        }
      }
      return (Notification)localObject1;
    }
    if (i >= 19)
    {
      localObject1 = ea.a(this.e);
      if (localObject1 != null) {
        this.f.putSparseParcelableArray("android.support.actionExtras", (SparseArray)localObject1);
      }
      this.a.setExtras(this.f);
      localObject1 = this.a.build();
      localObject2 = this.c;
      if (localObject2 != null) {
        ((Notification)localObject1).contentView = ((RemoteViews)localObject2);
      }
      localObject2 = this.d;
      if (localObject2 != null) {
        ((Notification)localObject1).bigContentView = ((RemoteViews)localObject2);
      }
      return (Notification)localObject1;
    }
    if (i >= 16)
    {
      localObject1 = this.a.build();
      Bundle localBundle1 = ca.a((Notification)localObject1);
      Bundle localBundle2 = new Bundle(this.f);
      Iterator localIterator = this.f.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        if (localBundle1.containsKey((String)localObject2)) {
          localBundle2.remove((String)localObject2);
        }
      }
      localBundle1.putAll(localBundle2);
      localObject2 = ea.a(this.e);
      if (localObject2 != null) {
        ca.a((Notification)localObject1).putSparseParcelableArray("android.support.actionExtras", (SparseArray)localObject2);
      }
      localObject2 = this.c;
      if (localObject2 != null) {
        ((Notification)localObject1).contentView = ((RemoteViews)localObject2);
      }
      localObject2 = this.d;
      if (localObject2 != null) {
        ((Notification)localObject1).bigContentView = ((RemoteViews)localObject2);
      }
      return (Notification)localObject1;
    }
    return this.a.getNotification();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */