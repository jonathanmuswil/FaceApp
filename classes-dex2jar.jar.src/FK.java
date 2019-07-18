import android.content.Context;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

class fk
  implements lca
{
  private final Uaa a;
  private final Context b;
  private final gk c;
  private final Ik d;
  private final yca e;
  private final rk f;
  final ScheduledExecutorService g;
  Dk h = new nk();
  
  public fk(Uaa paramUaa, Context paramContext, gk paramgk, Ik paramIk, yca paramyca, ScheduledExecutorService paramScheduledExecutorService, rk paramrk)
  {
    this.a = paramUaa;
    this.b = paramContext;
    this.c = paramgk;
    this.d = paramIk;
    this.e = paramyca;
    this.g = paramScheduledExecutorService;
    this.f = paramrk;
  }
  
  private void a(Runnable paramRunnable)
  {
    try
    {
      this.g.submit(paramRunnable);
    }
    catch (Exception paramRunnable)
    {
      Naa.e().b("Answers", "Failed to submit events task", paramRunnable);
    }
  }
  
  private void b(Runnable paramRunnable)
  {
    try
    {
      this.g.submit(paramRunnable).get();
    }
    catch (Exception paramRunnable)
    {
      Naa.e().b("Answers", "Failed to run events task", paramRunnable);
    }
  }
  
  public void a()
  {
    a(new ak(this));
  }
  
  public void a(Fk.a parama)
  {
    a(parama, false, false);
  }
  
  void a(Fk.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    parama = new ek(this, parama, paramBoolean2);
    if (paramBoolean1) {
      b(parama);
    } else {
      a(parama);
    }
  }
  
  public void a(Ica paramIca, String paramString)
  {
    a(new _j(this, paramIca, paramString));
  }
  
  public void a(String paramString)
  {
    a(new bk(this));
  }
  
  public void b()
  {
    a(new ck(this));
  }
  
  public void b(Fk.a parama)
  {
    a(parama, false, true);
  }
  
  public void c()
  {
    a(new dk(this));
  }
  
  public void c(Fk.a parama)
  {
    a(parama, true, false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */