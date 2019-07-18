import java.util.List;

public final class Bea$d
  extends Bea
{
  private static final QVa f = RVa.a(Eea.b);
  private static final QVa g = RVa.a(Fea.b);
  public static final d h;
  
  static
  {
    rXa localrXa1 = new rXa(vXa.a(d.class), "hostsService", "getHostsService()Lio/faceapp/api/services/FAHostsService;");
    vXa.a(localrXa1);
    rXa localrXa2 = new rXa(vXa.a(d.class), "hostsServicePro", "getHostsServicePro()Lio/faceapp/api/services/FAHostsServicePro;");
    vXa.a(localrXa2);
    e = new XXa[] { localrXa1, localrXa2 };
    h = new d();
  }
  
  private Bea$d()
  {
    super("production", "api.faceapp.io", "api-search.faceapp.io", null);
  }
  
  private final eia e()
  {
    QVa localQVa = f;
    XXa localXXa = e[0];
    return (eia)localQVa.getValue();
  }
  
  private final hia f()
  {
    QVa localQVa = g;
    XXa localXXa = e[1];
    return (hia)localQVa.getValue();
  }
  
  public XQa<List<bfa>> b()
  {
    XQa localXQa = zia.l.d().h().a(Dea.a);
    oXa.a(localXQa, "BillingRepository.observ…vice.getHosts()\n        }");
    return localXQa;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Bea$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */