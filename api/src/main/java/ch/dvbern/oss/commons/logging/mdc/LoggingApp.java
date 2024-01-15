package ch.dvbern.oss.commons.logging.mdc;

import com.vdurmont.semver4j.Semver;

public record LoggingApp(
		String appName,
		String appModule,
		Semver appVersion,
		String appInstance
) {
}