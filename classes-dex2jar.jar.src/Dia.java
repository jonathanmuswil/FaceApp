import java.util.HashMap;

public abstract interface dia
{
  @Qbb("voting/polls/my")
  public abstract XQa<lfa> a(@ccb("limit") int paramInt1, @ccb("offset") int paramInt2);
  
  @Qbb("feed/updates/unread")
  public abstract XQa<Nfa> a(@ccb("limit") int paramInt1, @ccb("offset") int paramInt2, @ccb("ordering") String paramString);
  
  @Ybb("feed/updates/unread/mark")
  public abstract XQa<Ffa> a(@Mbb Efa paramEfa);
  
  @Ybb("auth/accounts/ak/logout")
  public abstract XQa<Pea> a(@Mbb Nea paramNea);
  
  @Ybb("auth/accounts/fb/logout")
  public abstract XQa<Pea> a(@Mbb Oea paramOea);
  
  @Ybb("auth/user/credentials")
  public abstract XQa<Rea> a(@Mbb Sea paramSea);
  
  @Qbb("voting/polls/{poll_id}")
  public abstract XQa<nfa> a(@bcb("poll_id") String paramString);
  
  @Qbb("voting/polls/{poll_id}/votes")
  public abstract XQa<kfa> a(@bcb("poll_id") String paramString1, @ccb("limit") int paramInt, @ccb("ordering") String paramString2);
  
  @Ybb("voting/polls/{poll_id}")
  public abstract XQa<ofa> a(@bcb("poll_id") String paramString, @Mbb ffa paramffa);
  
  @Ybb("voting/polls/{poll_id}/votes/new")
  public abstract XQa<qfa> a(@bcb("poll_id") String paramString, @Mbb pfa parampfa);
  
  @Vbb
  @Ybb("voting/polls/new")
  public abstract XQa<ofa> a(@acb HashMap<String, AZa> paramHashMap);
  
  @Vbb
  @Ybb("auth/user")
  public abstract XQa<Tea> a(@acb HashMap<String, AZa> paramHashMap, @Tbb("X-FaceApp-UserToken") String paramString);
  
  @Ybb("devices/register")
  public abstract XQa<cWa> a(@Mbb yfa paramyfa);
  
  @Ybb("support/feedback/android")
  public abstract xQa a(@Mbb zfa paramzfa);
  
  @Qbb("feed/updates")
  public abstract XQa<Pfa> b(@ccb("limit") int paramInt1, @ccb("offset") int paramInt2, @ccb("ordering") String paramString);
  
  @Ybb("auth/logout")
  public abstract xQa b(@Tbb("X-FaceApp-UserToken") String paramString);
  
  @Qbb("feed/posts")
  public abstract XQa<vfa> c(@ccb("limit") int paramInt1, @ccb("offset") int paramInt2, @ccb("ordering") String paramString);
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */