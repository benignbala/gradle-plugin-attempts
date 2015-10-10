package org.fosstools.gradle.dpkg

import org.gradle.api.Plugin
import org.gradle.api.Project

class DpkgPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create(DpkgPackageExtension.EXTENSION_NAME, DpkgPackageExtension, project )
        project.tasks.create('dpkg', DpkgPackageTask).configure {
            description "Creates a .deb file from a Debian source"
            group "Debian packaing tasks"
        }
    }
}
