plugins {
  `java-platform`
}

javaPlatform{
  allowDependencies()
}

dependencies{
  for (bomDependency in libs.bundles.bomDependencies.get()) {
    logger.lifecycle("::: bomDependency $bomDependency ::: ")
    api(platform(bomDependency))
  }

  constraints{
    api(libs.bundles.dependencies)
  }
}
