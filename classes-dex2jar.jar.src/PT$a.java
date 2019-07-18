public abstract class PT$a<MessageType extends PT<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends BT.a<MessageType, BuilderType>
{
  private final MessageType a;
  protected MessageType b;
  protected boolean c;
  
  protected PT$a(MessageType paramMessageType)
  {
    this.a = paramMessageType;
    this.b = ((PT)paramMessageType.a(PT.i.e));
    this.c = false;
  }
  
  protected BuilderType a(MessageType paramMessageType)
  {
    b(paramMessageType);
    return this;
  }
  
  public MessageType a()
  {
    return this.a;
  }
  
  public BuilderType b(MessageType paramMessageType)
  {
    c();
    this.b.a(PT.h.a, paramMessageType);
    return this;
  }
  
  public MessageType b()
  {
    if (this.c) {
      return this.b;
    }
    this.b.h();
    this.c = true;
    return this.b;
  }
  
  public final MessageType build()
  {
    PT localPT = b();
    if (localPT.isInitialized()) {
      return localPT;
    }
    throw BT.a.b(localPT);
  }
  
  protected void c()
  {
    if (this.c)
    {
      PT localPT = (PT)this.b.a(PT.i.e);
      localPT.a(PT.h.a, this.b);
      this.b = localPT;
      this.c = false;
    }
  }
  
  public BuilderType clone()
  {
    a locala = a().i();
    locala.b(b());
    return locala;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/PT$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */