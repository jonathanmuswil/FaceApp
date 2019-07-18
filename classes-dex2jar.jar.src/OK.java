import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class ok
  implements Dk
{
  private final Uaa a;
  private final yca b;
  private final Context c;
  private final Ak d;
  private final ScheduledExecutorService e;
  private final AtomicReference<ScheduledFuture<?>> f = new AtomicReference();
  final Gk g;
  private final rk h;
  nca i;
  lba j = new lba();
  pk k = new uk();
  boolean l = true;
  boolean m = true;
  volatile int n = -1;
  boolean o = false;
  boolean p = false;
  
  public ok(Uaa paramUaa, Context paramContext, ScheduledExecutorService paramScheduledExecutorService, Ak paramAk, yca paramyca, Gk paramGk, rk paramrk)
  {
    this.a = paramUaa;
    this.c = paramContext;
    this.e = paramScheduledExecutorService;
    this.d = paramAk;
    this.b = paramyca;
    this.g = paramGk;
    this.h = paramrk;
  }
  
  public void a()
  {
    if (this.i == null)
    {
      oba.c(this.c, "skipping files send because we don't yet know the target endpoint");
      return;
    }
    oba.c(this.c, "Sending all files");
    List localList = this.d.d();
    int i1 = 0;
    for (;;)
    {
      int i2 = i1;
      int i3 = i1;
      try
      {
        if (localList.size() > 0)
        {
          i2 = i1;
          oba.c(this.c, String.format(Locale.US, "attempt to send batch of %d files", new Object[] { Integer.valueOf(localList.size()) }));
          i2 = i1;
          boolean bool = this.i.a(localList);
          i3 = i1;
          if (bool)
          {
            i2 = i1;
            i3 = i1 + localList.size();
            i2 = i3;
            this.d.a(localList);
          }
          if (bool)
          {
            i2 = i3;
            localList = this.d.d();
            i1 = i3;
          }
        }
      }
      catch (Exception localException)
      {
        Context localContext = this.c;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Failed to send batch of analytics files to server: ");
        localStringBuilder.append(localException.getMessage());
        oba.a(localContext, localStringBuilder.toString(), localException);
        i3 = i2;
        if (i3 == 0) {
          this.d.b();
        }
      }
    }
  }
  
  void a(long paramLong1, long paramLong2)
  {
    int i1;
    if (this.f.get() == null) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      qca localqca = new qca(this.c, this);
      Context localContext = this.c;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Scheduling time based file roll over every ");
      localStringBuilder.append(paramLong2);
      localStringBuilder.append(" seconds");
      oba.c(localContext, localStringBuilder.toString());
      try
      {
        this.f.set(this.e.scheduleAtFixedRate(localqca, paramLong1, paramLong2, TimeUnit.SECONDS));
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        oba.a(this.c, "Failed to schedule time based file roll over", localRejectedExecutionException);
      }
    }
  }
  
  public void a(Fk.a parama)
  {
    parama = parama.a(this.g);
    Object localObject;
    StringBuilder localStringBuilder;
    if ((!this.l) && (Fk.b.g.equals(parama.c)))
    {
      localObject = Naa.e();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Custom events tracking disabled - skipping event: ");
      localStringBuilder.append(parama);
      ((Xaa)localObject).d("Answers", localStringBuilder.toString());
      return;
    }
    if ((!this.m) && (Fk.b.h.equals(parama.c)))
    {
      localObject = Naa.e();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Predefined events tracking disabled - skipping event: ");
      localStringBuilder.append(parama);
      ((Xaa)localObject).d("Answers", localStringBuilder.toString());
      return;
    }
    if (this.k.a(parama))
    {
      localObject = Naa.e();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Skipping filtered event: ");
      localStringBuilder.append(parama);
      ((Xaa)localObject).d("Answers", localStringBuilder.toString());
      return;
    }
    try
    {
      this.d.a(parama);
    }
    catch (IOException localIOException)
    {
      localObject = Naa.e();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to write event: ");
      localStringBuilder.append(parama);
      ((Xaa)localObject).b("Answers", localStringBuilder.toString(), localIOException);
    }
    e();
    int i1;
    if ((!Fk.b.g.equals(parama.c)) && (!Fk.b.h.equals(parama.c))) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    boolean bool = "purchase".equals(parama.g);
    if ((this.o) && (i1 != 0))
    {
      if ((bool) && (!this.p)) {
        return;
      }
      try
      {
        this.h.a(parama);
      }
      catch (Exception localException)
      {
        Xaa localXaa = Naa.e();
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Failed to map event to Firebase: ");
        ((StringBuilder)localObject).append(parama);
        localXaa.b("Answers", ((StringBuilder)localObject).toString(), localException);
      }
    }
  }
  
  public void a(Ica paramIca, String paramString)
  {
    this.i = jk.a(new Bk(this.a, paramString, paramIca.a, this.b, this.j.d(this.c)));
    this.d.a(paramIca);
    this.o = paramIca.f;
    this.p = paramIca.g;
    Object localObject1 = Naa.e();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Firebase analytics forwarding ");
    boolean bool = this.o;
    String str = "enabled";
    if (bool) {
      paramString = "enabled";
    } else {
      paramString = "disabled";
    }
    ((StringBuilder)localObject2).append(paramString);
    ((Xaa)localObject1).d("Answers", ((StringBuilder)localObject2).toString());
    localObject1 = Naa.e();
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Firebase analytics including purchase events ");
    if (this.p) {
      paramString = "enabled";
    } else {
      paramString = "disabled";
    }
    ((StringBuilder)localObject2).append(paramString);
    ((Xaa)localObject1).d("Answers", ((StringBuilder)localObject2).toString());
    this.l = paramIca.h;
    localObject2 = Naa.e();
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Custom event tracking ");
    if (this.l) {
      paramString = "enabled";
    } else {
      paramString = "disabled";
    }
    ((StringBuilder)localObject1).append(paramString);
    ((Xaa)localObject2).d("Answers", ((StringBuilder)localObject1).toString());
    this.m = paramIca.i;
    localObject1 = Naa.e();
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Predefined event tracking ");
    if (this.m) {
      paramString = str;
    } else {
      paramString = "disabled";
    }
    ((StringBuilder)localObject2).append(paramString);
    ((Xaa)localObject1).d("Answers", ((StringBuilder)localObject2).toString());
    if (paramIca.k > 1)
    {
      Naa.e().d("Answers", "Event sampling enabled");
      this.k = new zk(paramIca.k);
    }
    this.n = paramIca.b;
    a(0L, this.n);
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = this.d.g();
      return bool;
    }
    catch (IOException localIOException)
    {
      oba.a(this.c, "Failed to roll file over.", localIOException);
    }
    return false;
  }
  
  public void c()
  {
    if (this.f.get() != null)
    {
      oba.c(this.c, "Cancelling time-based rollover because no events are currently being generated.");
      ((ScheduledFuture)this.f.get()).cancel(false);
      this.f.set(null);
    }
  }
  
  public void d()
  {
    this.d.a();
  }
  
  public void e()
  {
    int i1;
    if (this.n != -1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0) {
      a(this.n, this.n);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */