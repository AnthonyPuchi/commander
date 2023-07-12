CREATE VIEW saucer_proteins_view AS
SELECT s.id AS saucer_id, s.name AS saucer_name, p.quantity AS proteins_quantity
FROM saucer_proteins sp
JOIN saucer s ON sp.saucer_id = s.id
JOIN proteins p ON sp.proteins_id = p.id;



