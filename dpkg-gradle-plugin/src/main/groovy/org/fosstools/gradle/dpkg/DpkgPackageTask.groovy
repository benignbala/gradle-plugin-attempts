package org.fosstools.gradle.dpkg

import groovy.transform.CompileDynamic
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional


class DpkgPackageTask extends DefaultTask{
        DpkgPackageTask() {
    }

    @Input
    @Optional
    boolean forceRepack = false

    @Input
    @CompileDynamic
    String getPkgName() {
        this.pkgName ?: project.extensions.getByName()
    }
    private String pkgName
}
