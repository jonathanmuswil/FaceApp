public abstract class KD$c<MessageType extends c<MessageType, BuilderType>, BuilderType>
  extends KD<MessageType, BuilderType>
  implements qE
{
  protected FD<Object> zztc = FD.e();
  
  final FD<Object> f()
  {
    if (this.zztc.a()) {
      this.zztc = ((FD)this.zztc.clone());
    }
    return this.zztc;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/KD$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */