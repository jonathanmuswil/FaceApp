import com.google.firebase.remoteconfig.a;

final class hsa<TResult>
  implements iP<Void>
{
  hsa(a parama, boolean paramBoolean, long paramLong) {}
  
  public final void a(nP<Void> paramnP)
  {
    oXa.b(paramnP, "task");
    if (paramnP.e())
    {
      icb.a("RemoteConfig").a("fetch successful", new Object[0]);
      this.a.a();
      if (this.b) {
        isa.a(isa.d, this.a, this.c, false);
      }
    }
    else
    {
      icb.a("RemoteConfig").a("fetch failed", new Object[0]);
    }
    if (!this.b) {
      isa.a(isa.d).a(new Object());
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */