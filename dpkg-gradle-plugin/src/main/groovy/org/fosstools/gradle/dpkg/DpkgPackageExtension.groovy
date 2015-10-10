package org.fosstools.gradle.dpkg

import org.gradle.api.Project
import org.gradle.util.CollectionUtils


class DpkgPackageExtension {
    static final String EXTENSION_NAME = 'dpkg'

    String executable = 'dpkg'

    DpkgPackageExtension(Project p) {
        proejct = p
    }

    List<String> getArgs() {
        CollectionUtils.stringize(args)
    }

    String getPkgName() {
        this.pkgName
    }

    void pkgName(String name) {
        this.pkgName = name
    }
    void args(Object... args) {
        this.args.addAll(args as List)
    }

    private List<Object> args = ["-b"]
    private String pkgName;
}
