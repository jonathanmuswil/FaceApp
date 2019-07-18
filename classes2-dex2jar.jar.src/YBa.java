import android.opengl.GLES20;

final class yBa
  extends pXa
  implements bXa<cWa>
{
  yBa(ABa paramABa)
  {
    super(0);
  }
  
  public final void b()
  {
    GLES20.glDeleteTextures(1, new int[] { ABa.b(this.b) }, 0);
    ABa.a(this.b, -1);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */