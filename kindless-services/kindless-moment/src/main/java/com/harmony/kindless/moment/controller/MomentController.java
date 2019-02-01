package com.harmony.kindless.moment.controller;

import com.harmony.kindless.apis.domain.moment.Moment;
import com.harmony.kindless.apis.dto.CurrentUser;
import com.harmony.kindless.apis.dto.MomentDto;
import com.harmony.kindless.moment.service.MomentService;
import com.harmony.umbrella.web.Response;
import com.harmony.umbrella.web.method.annotation.BundleController;
import com.harmony.umbrella.web.method.annotation.BundleView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author wuxii
 */
@BundleController
public class MomentController {

	@Autowired
	private MomentService momentService;

	@PostMapping("/moment/push")
	public Response<String> push(@RequestBody MomentDto moment, CurrentUser user) {
		momentService.push(moment, user);
		return Response.ok("success");
	}

	@BundleView({"new", "id"})
	@GetMapping("/moments")
	public List<Moment> moments(CurrentUser user, Pageable pageable) {
		return momentService.getMoments(user, pageable);
	}

}