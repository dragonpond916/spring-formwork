import net.rubygrapefruit.platform.SystemInfo


fun isMacOs(): Boolean {
  return System.getProperty("os.name").startsWith("Mac OS X")
}

fun getOsArch(): String {
  return System.getProperty("os.arch")
}

fun isMacSiliconArch():Boolean{
  return isMacOs() && SystemInfo.Architecture.aarch64.name.lowercase() == getOsArch()
}
