package pe.scytl.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.scytl.app.entity.Territory;

/**
 * Created by robertoespinoza on 20/11/14.
 */
@RestController
@RequestMapping("/territories")
public class TerritoryController extends GenericController<Territory, Integer> {

}
