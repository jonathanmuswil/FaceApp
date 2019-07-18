public final class jCa
  extends _Ba
{
  public jCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform lowp float intensity;\n\nconst vec3 W = vec3(0.2125, 0.7154, 0.0721);\nconst vec3 RED = vec3(1.0, 0.0, 0.0);\nconst vec3 GB  = vec3(0.0, 1.0, 1.0);\n\nvoid main()\n{\n    vec3  tex  = texture2D(inputImageTexture, textureCoordinate).rgb;\n    vec3  tex2 = texture2D(inputImageTexture, textureCoordinate + vec2(0.015)).rgb;\n\n    vec3  red = vec3(dot(tex2, W)) * RED;\n    vec3  gb  = vec3(dot(tex, W)) * GB;\n\n    vec3 resultColor = max(red, mix(tex, gb, 0.3));\n    gl_FragColor = vec4((intensity * resultColor) + ((1.0 - intensity) * tex), 1.0);\n}\n", new String[0], 0, 4, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */