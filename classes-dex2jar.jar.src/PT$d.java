public abstract class PT$d<MessageType extends d<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>>
  extends PT<MessageType, BuilderType>
  implements PT.e<MessageType, BuilderType>
{
  protected NT<PT.f> d = NT.d();
  
  final void a(PT.j paramj, MessageType paramMessageType)
  {
    super.a(paramj, paramMessageType);
    this.d = paramj.a(this.d, paramMessageType.d);
  }
  
  protected final void h()
  {
    super.h();
    this.d.c();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/PT$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */