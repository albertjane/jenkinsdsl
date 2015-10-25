def project = 'slidergame'
def platforms = [ios, linux, win, osx, android]
platforms.each {
	def platform = it.name 
	def jobName = "${project}.${platform}.CI"

	job(jobName) {
		scm {
		    git("http://github.com/${project}.git", platform)
		}
	}
}
